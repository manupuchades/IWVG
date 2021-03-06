package ticTacToe.v460.controllers.local;

import ticTacToe.v460.controllers.ColocateControllerVisitor;
import ticTacToe.v460.controllers.OperationControllerVisitor;
import ticTacToe.v460.controllers.PutController;
import ticTacToe.v460.controllers.errors.ErrorReport;
import ticTacToe.v460.models.Coordinate;
import ticTacToe.v460.models.Game;

public class LocalPutController extends LocalColocateController implements
		PutController {

	LocalPutController(Game game, LocalCoordinateController coordinateController) {
		super(game, coordinateController);
	}

	@Override
	public void put(Coordinate target) {
		assert this.validateTarget(target) == null;
		super.put(target);
	}

	public ErrorReport validateTarget(Coordinate target) {
		return super.validateTarget(target);
	}

	@Override
	public void accept(OperationControllerVisitor operationControllerVisitor) {
		operationControllerVisitor.visit(this);
	}

	@Override
	public void accept(ColocateControllerVisitor colocateControllerVisitor) {
		colocateControllerVisitor.visit(this);
	}
}
