// package com.crio.starter.service;

// import static org.junit.jupiter.api.Assertions.assertEquals;
// import static org.mockito.Mockito.never;
// import static org.mockito.Mockito.times;
// import static org.mockito.Mockito.verify;
// import static org.mockito.Mockito.when;
// import com.crio.starter.Exception.MemeNotFoundException;
// import com.crio.starter.controller.GreetingsController;
// import com.crio.starter.data.GreetingsEntity;
// import com.crio.starter.entity.Meme;
// import com.crio.starter.exchange.MemeDTO;
// import com.crio.starter.exchange.ResponseDto;
// import com.crio.starter.repository.GreetingsRepository;
// import com.crio.starter.repository.MemeRepository;
// import java.util.Optional;
// import org.junit.jupiter.api.BeforeEach;
// import org.junit.jupiter.api.Test;
// import org.junit.jupiter.api.extension.ExtendWith;
// import org.mockito.InjectMocks;
// import org.mockito.Mock;
// import org.mockito.Mockito;
// import org.mockito.MockitoAnnotations;
// import org.mockito.junit.jupiter.MockitoExtension;
// import org.mockito.junit.jupiter.MockitoSettings;
// import org.mockito.quality.Strictness;
// import org.springframework.http.HttpStatus;
// import org.springframework.http.ResponseEntity;

// @ExtendWith(MockitoExtension.class)
// @MockitoSettings(strictness = Strictness.STRICT_STUBS)
// class GreetingsServiceTest {

//   @Mock
//   private GreetingsRepository greetingsRepository;

//   @Mock
//   private MemeRepository memeRepository;

//   @InjectMocks
//   private GreetingsService greetingsService;

//   @InjectMocks
//   private CreateMemeService memeService;
//   @InjectMocks
//   private GreetingsController greetingsController;

//   @BeforeEach
//   public void setup() {
//     MockitoAnnotations.openMocks(this);
//   }

//   @Test
//   void getMessage() {
//     GreetingsEntity greetingsEntity = getGreeting("001", "Welcome");
//     Mockito.doReturn(greetingsEntity).when(greetingsRepository).findByExtId("001");
//     ResponseDto responseDto = greetingsService.getMessage("001");

//     ResponseDto expected = new ResponseDto("Welcome");
//     assertEquals(expected, responseDto);

//   }

//   private GreetingsEntity getGreeting(String id, String message) {
//     GreetingsEntity greetingsEntity = new GreetingsEntity();
//     greetingsEntity.setExtId(id);
//     greetingsEntity.setMessage(message);
//     return greetingsEntity;
//   }

//   // @Test
//   // void testCreateMeme() throws MemeNotFoundException {
//   //   Meme meme = new Meme("1", "https://example.com/image.jpg", "Funny meme", "caption 1");
//   //   Meme savedMeme = new Meme("1", "https://example.com/image.jpg", "Funny meme", "caption 2");

//   //   // when(memeService.getMemeById("1")).thenThrow(new MemeNotFoundException("Meme Not Found"));
//   //   when(memeService.createMeme(meme)).thenReturn(savedMeme);

//   //   ResponseEntity<Meme> result = greetingsController.createMeme(meme);

//   //   assertEquals(HttpStatus.CREATED, result.getStatusCode());
//   //   assertEquals(savedMeme, result.getBody());

//   //   verify(memeService, times(1)).getMemeById("1");
//   //   verify(memeService, times(1)).createMeme(meme);
//   // }

//   // @Test
//   // void testCreateMemeWithDuplicateId() throws MemeNotFoundException {
//   //   Meme meme = new Meme("1", "https://example.com/image.jpg", "Funny meme", "caption 1");
//   //   MemeDTO savedMeme =
//   //       new MemeDTO("1", "https://example.com/image.jpg", "Funny meme", "caption 2");

//   //   when(memeService.getMemeById("1")).thenReturn(savedMeme);

//   //   ResponseEntity<Meme> result = greetingsController.createMeme(meme);

//   //   assertEquals(HttpStatus.ALREADY_REPORTED, result.getStatusCode());

//   //   verify(memeService, times(1)).getMemeById("1");
//   //   verify(memeService, never()).createMeme(meme);
//   // }
// }
