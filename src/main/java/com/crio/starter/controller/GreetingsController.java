// package com.crio.starter.controller;

// import com.crio.starter.Exception.MemeNotFoundException;
// import com.crio.starter.entity.Meme;
// import com.crio.starter.exchange.MemeDTO;
// import com.crio.starter.exchange.ResponseDto;
// import com.crio.starter.service.CreateMemeService;
// import com.crio.starter.service.GreetingsService;
// import lombok.RequiredArgsConstructor;
// import java.util.List;
// import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.http.HttpStatus;
// import org.springframework.http.ResponseEntity;
// import org.springframework.web.bind.annotation.GetMapping;
// import org.springframework.web.bind.annotatioa/n.PostMapping;
// import org.springframework.web.bind.annotation.RequestBody;
// import org.springframework.web.bind.annotation.RequestParam;
// import org.springframework.web.bind.annotation.RestController;

// @RestController
// @RequiredArgsConstructor(onConstructor = @__(@Autowired))
// public class GreetingsController {
//   @Autowired
//   private final CreateMemeService createMemeService;
//   private final GreetingsService greetingsService;

//   @GetMapping("/say-hello")
//   public ResponseDto sayHello(@RequestParam String messageId) {
//     return greetingsService.getMessage(messageId);
//   }

//   @PostMapping("/memes")
//   public ResponseEntity<Meme> createMeme(@RequestBody Meme meme) {
//     String id = meme.getId();

//     try {
//       MemeDTO checkMeme = createMemeService.getMemeById(id);
//       if (checkMeme != null) {
//         return ResponseEntity.status(HttpStatus.ALREADY_REPORTED).build();
//       }
//     } catch (MemeNotFoundException e) {
//       // Meme not found, continue with meme creation
//     }

//     Meme savedMeme = createMemeService.createMeme(meme);
//     return ResponseEntity.status(HttpStatus.CREATED).body(savedMeme);
//   }

//   @GetMapping("/memes")
//   public ResponseEntity<List<MemeDTO>> getAllMemes() {
//     List<MemeDTO> memes = createMemeService.getAllMemes();
//     return ResponseEntity.ok(memes);
//   }

//   @GetMapping("/memes/latest")
//   public List<MemeDTO> getLatestMemes() {
//     List<MemeDTO> memes = createMemeService.getLatestMemes(100);
//     return memes;
//   }

//   @GetMapping
//   public ResponseEntity<MemeDTO> getMemeById(String id) {
//     try {
//       MemeDTO meme = createMemeService.getMemeById(id);
//       return ResponseEntity.ok(meme);
//     } catch (MemeNotFoundException e) {
//       return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
//     }
//   }


// }
