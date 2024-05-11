package com.nabatech.cards.service;

import com.nabatech.cards.dto.CardsDto;

public interface CardsService {

    void createCard(String mobileNumber);
    CardsDto fetchCard(String mobileNumber);
    boolean updateCard(CardsDto cardsDto);
    boolean deleteCard(String mobileNumber);

}
