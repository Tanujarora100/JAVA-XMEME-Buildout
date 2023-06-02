package com.crio.starter.service;

import java.util.ArrayList;
import com.crio.starter.exchange.ResponseDto;

public class ServiceHelperMethods {
    protected Boolean postValidation(ResponseDto post) {
        if (post == null)
            return false;

        String name = post.getName();
        String url = post.getUrl();
        String caption = post.getCaption();

        if (name == null || name.isBlank()) {
            return false;
        }

        if (url == null || url.isBlank()) {
            return false;
        }

        if (caption == null || caption.isBlank()) {
            return false;
        }
        return true;
    }
    protected ArrayList<Object> getNewArrayList() {
        return new ArrayList<>();
    }
}
