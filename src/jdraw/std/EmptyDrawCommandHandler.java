/*
 * Copyright (c) 2000-2012 Fachhochschule Nordwestschweiz (FHNW)
 * All Rights Reserved. 
 */

package jdraw.std;

import jdraw.framework.DrawCommand;
import jdraw.framework.DrawCommandHandler;

/**
 * Provides an empty command handler. This class provides an empty dummy implementation of the draw command
 * handler. It enables the application to start up correctly and to behave meaningful, but with the limitation
 * that it does not provide any undo/redo behavior. 
 * @author Christoph. Denzler
 *
 */
public class EmptyDrawCommandHandler implements DrawCommandHandler {

	public EmptyDrawCommandHandler(){
		System.out.println("Instantiated the draw command handler");
	}
	@Override
	public void addCommand(DrawCommand cmd) { System.out.println("Add Command"); }
	
	@Override
	public void undo() { System.out.println("undo"); }

	@Override
	public void redo() { System.out.println("redo"); }

	@Override
	public boolean undoPossible() { return false; }

	@Override
	public boolean redoPossible() { return false; }

	@Override
	public void beginScript() { System.out.println("begin script"); }

	@Override
	public void endScript() { System.out.println("end script"); }

	@Override
	public void clearHistory() { System.out.println("clear history");}
}
