package com.crio.starter.service;

import java.util.List;
import com.crio.starter.exchange.ResponseDto;

public interface XMemeService {
    public ResponseDto saveMemes(ResponseDto responseDto);
    public ResponseDto getMemeById(long id);
    public ResponseDto deleteMemeById(long id);
    public List<ResponseDto> getMemes();
    
}
