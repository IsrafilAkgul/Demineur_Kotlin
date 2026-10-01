data class Board(
    // The number of lines on the grid.
    var height: Int = 8,

    // The number of column on the grid.
    var width: Int = 8,

    // The grid that is composed of cells.
    var grid: Array<Array<Cell>> = Array(height) {
        Array(width) { Cell() } },

    // Tell if the board was cleared.
    var isCleared: Boolean = false,

    // The number of bomb that will be on the board.
    var numberBombs: Int = 0
)


// The Board's equals function and hashcode function
{
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as Board

        if (height != other.height) return false
        if (width != other.width) return false
        if (isCleared != other.isCleared) return false
        if (numberBombs != other.numberBombs) return false
        if (!grid.contentDeepEquals(other.grid)) return false

        return true
    }

    override fun hashCode(): Int {
        var result = height
        result = 31 * result + width
        result = 31 * result + isCleared.hashCode()
        result = 31 * result + numberBombs
        result = 31 * result + grid.contentDeepHashCode()
        return result
    }
}


// The Getters
fun getHeight(board: Board): Int {
    return board.height
}

fun getWidth(board: Board): Int {
    return board.width
}

fun getCell(board: Board, row: Int, col: Int): Cell {
    return board.grid[row][col]
}

fun getNumberBombs(board: Board): Int {
    return board.numberBombs
}


// The Setters

fun setHeight(board: Board, height: Int) {
    board.height = height
}

fun setWidth(board: Board, width: Int) {
    board.width = width
}

fun setNumberBomb(board: Board, number: Int) {
    board.numberBombs = number
}