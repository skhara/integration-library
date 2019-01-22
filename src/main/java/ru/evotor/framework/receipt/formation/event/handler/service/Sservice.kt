package ru.evotor.framework.receipt.formation.event.handler.service

import ru.evotor.framework.receipt.formation.event.BeforePositionsChangedEvent

class Sservice : SellIntegrationService() {

    override fun handleBeforePositionsChangedEvent(event: BeforePositionsChangedEvent): BeforePositionsChangedEvent.Result? {
        return super.handleBeforePositionsChangedEvent(event)
    }

}