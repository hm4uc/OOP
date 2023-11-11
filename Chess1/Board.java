import java.util.ArrayList;

public class Board {
    public static final int WIDTH = 8;
    public static final int HEIGHT = 8;
    private ArrayList<Piece> pieces = new ArrayList<>();

    /**
     * constructor1.
     */
    public Board() {
    }

    ;

    public ArrayList<Piece> getPieces() {
        return pieces;
    }

    public void setPieces(ArrayList<Piece> pieces) {
        this.pieces = pieces;
    }

    /**
     * addPiece.
     */
    public void addPiece(Piece piece) {
        if (validate(piece.getCoordinatesX(), piece.getCoordinatesY())) {
            for (Piece p : pieces) {
                if (piece.checkPosition(p)) {
                    return;
                }
            }
            pieces.add(piece);
        }
    }

    /**
     * validate.
     */
    public boolean validate(int x, int y) {
        return (x >= 1 && x <= 8 && y >= 1 && y <= 8);
    }

    /**
     * getAt.
     */
    public Piece getAt(int x, int y) {
        for (Piece p : pieces) {
            if (p.getCoordinatesX() == x && p.getCoordinatesY() == y) {
                return p;
            }
        }
        return null;
    }

    /**
     * removeAt.
     */
    public void removeAt(int x, int y) {
        pieces.remove(getAt(x, y));
    }
}
