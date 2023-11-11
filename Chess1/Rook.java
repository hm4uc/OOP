public class Rook extends Piece {
    /**
     * constructor1.
     */
    public Rook(int coordinatesX, int coordinatesY) {
        super(coordinatesX, coordinatesY);
    }

    /**
     * constructor2.
     */
    public Rook(int coordinatesX, int coordinatesY, String color) {
        super(coordinatesX, coordinatesY, color);
    }

    @Override
    public String getSymbol() {
        return "R";
    }

    /**
     * canMove.
     */
    @Override
    public boolean canMove(Board board, int x, int y) {
        //Chi cho phep di ngang va doc
        if (x != this.getCoordinatesX() && y != this.getCoordinatesY()) {
            return false;
        }

        //Gap chuong ngai vat thi khong di duoc
        if (x > this.getCoordinatesX()) {
            for (int i = this.getCoordinatesX() + 1; i < x; i++) {
                if (board.getAt(i, y) != null) {
                    return false;
                }
            }
        }
        if (x < this.getCoordinatesX()) {
            for (int i = this.getCoordinatesX() - 1; i > x; i--) {
                if (board.getAt(i, y) != null) {
                    return false;
                }
            }
        }
        if (y > this.getCoordinatesY()) {
            for (int i = this.getCoordinatesY() + 1; i < y; i++) {
                if (board.getAt(x, i) != null) {
                    return false;
                }
            }
        }
        if (y < this.getCoordinatesY()) {
            for (int i = this.getCoordinatesY() - 1; i > y; i--) {
                if (board.getAt(x, i) != null) {
                    return false;
                }
            }
        }

        //Tai (x, y) co quan cung mau thi khong an
        if (board.getAt(x, y) != null) {
            return !board.getAt(x, y).getColor().equals(this.getColor());
        }

        return true;
    }
}
