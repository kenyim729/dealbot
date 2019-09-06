package me.lkp111138.dealbot.game.cards.actions;

import me.lkp111138.dealbot.game.GamePlayer;
import me.lkp111138.dealbot.game.cards.ActionCard;

public class RentActionCard extends ActionCard {
    private final int[] groups;

    public RentActionCard(int[] groups) {
        this.groups = groups;
    }

    @Override
    public int currencyValue() {
        return this.groups.length > 2 ? 3 : 1;
    }

    @Override
    public String getCardTitle() {
        return "Action Card - Rent";
    }

    @Override
    public void execute(GamePlayer player, Object[] args) {
        // full wildcard: 1 payer
        // double wildcard: all pays
    }
}
