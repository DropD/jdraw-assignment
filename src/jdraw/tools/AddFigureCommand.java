package jdraw.tools;

import jdraw.framework.DrawCommand;
import jdraw.framework.DrawModel;
import jdraw.framework.Figure;

public class AddFigureCommand implements DrawCommand {

	private Figure f;
	private DrawModel model;
	//private int index;
	
	public AddFigureCommand(Figure f, DrawModel model) {
		this.f = f;
		this.model = model;
		System.out.println("AddFigureCommand");
	}

	@Override
	public void redo() {
		model.addFigure(f);
	}

	@Override
	public void undo() {
		System.out.println("AddFigureCommand: undo");
		model.removeFigure(f);
	}

}
