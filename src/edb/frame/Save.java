package edb.frame;

import java.util.Vector;

import edb.frame.commands.EDBStateCommand;

public interface Save {

	void save(Vector<EDBStateCommand> commands);

}
