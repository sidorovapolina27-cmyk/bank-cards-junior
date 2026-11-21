package com.bank.cards.card;

import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Ручной маппер Card -> CardDto.
 */
@Component
public class CardMapper {

    public CardDto toDto(Card card) {
        return new CardDto(
                card.getId(),
                card.getClientId(),
                card.getPan(),
                card.getCardHolderName(),
                card.getCardType(),
                card.getPaymentSystem(),
                card.getStatus(),
                card.getValidTo(),
                card.getValidFrom()
        );
    }

    public List<CardDto> toDtoList(List<Card> cards) {
        return cards.stream()
                .map(this::toDto)
                .toList();
    }
}
