package com.example.finalproject.Listeners;

import com.example.finalproject.Models.RandomRecipeResponse;

public interface RandomRecipeListener {
    void didFetch(RandomRecipeResponse response, String message);
    void didError(String message);
}
