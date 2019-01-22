package ru.evotor.framework.receipt.position

sealed class PositionChangeIntention

data class PositionAddIntention(
        val position: Position
) : PositionChangeIntention()

data class PositionReplaceIntention(
        val oldPosition: Position,
        val newPosition: Position
) : PositionChangeIntention()

data class PositionRemoveIntention(
        val position: Position
) : PositionChangeIntention()