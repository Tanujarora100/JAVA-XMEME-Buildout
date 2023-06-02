package com.crio.starter.controller;


import lombok.RequiredArgsConstructor;
import java.util.List;
import com.crio.starter.exchange.ResponseDto;
import com.crio.starter.service.XMemeService;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

@RestController
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
public class XMemeController {
    @Autowired
    private final XMemeService xmemeService;


    // Api to get the Latest memes with limit of 100.
    @GetMapping("memes")
    public ResponseEntity<List<ResponseDto>> getLatestMemes() {
        List<ResponseDto> responses = null;
        responses = xmemeService.getMemes();
        if (responses == null)
            return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
        return ResponseEntity.ok(responses);
    }
    // All the service layer methods are returning a DTO which was mapped to the Entity class in the
    // service layer itself.

    // Api to fetch a specific meme if not found then we can return not found error
    @GetMapping("memes/{id}")
    public ResponseEntity<ResponseDto> getMemeById(ResponseDto meme) {
        ResponseDto response;
        response = xmemeService.getMemeById(meme.getId());
        if (response == null) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
        } else {
            return ResponseEntity.ok(response);
        }
        // getMemeByID() will return a responseDTO here from the service layer.

    }

    // API to persist the meme

    @PostMapping("memes")
    public ResponseEntity<ResponseDto> saveMemes(@RequestBody ResponseDto responseDto){
      ResponseDto response = null;
      response = xmemeService.saveMemes(responseDto);
      if(response == null) return ResponseEntity.status(HttpStatus.CONFLICT).build();
      return ResponseEntity.ok(response);
    }
    // Adding comments to make the code more readable.

    @DeleteMapping("memes/{id}")
    public ResponseEntity<ResponseDto> deleteMemeById(@PathVariable("id") long id) {
      ResponseDto response = null;
      response = xmemeService.deleteMemeById(id);
      if(response == null) return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
      return ResponseEntity.ok(response);
    }
}

