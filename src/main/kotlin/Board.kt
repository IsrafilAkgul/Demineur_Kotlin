import javax.swing.Spring.height
import kotlin.collections.listOf

data class Board(
    // The number of row on the grid.
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
) {


    // The Getters

    fun getCell(row: Int, col: Int): Cell {
        return grid[row][col]
    }


    fun getNeighbors(row: Int, col: Int): MutableList<Pair<Int, Int>> {
        // The list of neighbours of grid[row][col]
        var neighbours: MutableList<Pair<Int, Int>> = mutableListOf()

        for(rowLoop in -1..1) {
            for(colLoop in -1..1) {
                // Central cell
                if (rowLoop == 0 && colLoop == 0) {
                    continue
                }

                val newRow = row + rowLoop
                val newCol = col + colLoop

                if (newRow in 0..<height && newCol in 0..<width) {
                    neighbours.add(Pair(newRow, newCol))
                }
            }
        }

        return neighbours
    }
}