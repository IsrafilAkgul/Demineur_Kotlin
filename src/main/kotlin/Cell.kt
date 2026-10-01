data class Cell(
    // A boolean that tells if this cell is a bomb.
    val isBomb: Boolean = false,

    // The number of bombs in the nearby cells.
    val numberBombNeighbor: Int = 0,

    // A boolean that tells if this cell was revealed by the player.
    var isRevealed: Boolean = false,

    // A boolean that tells if the player put a flag on this cell.
    var isFlagged: Boolean = false
)
