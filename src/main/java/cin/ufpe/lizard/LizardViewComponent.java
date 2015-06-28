package cin.ufpe.lizard;

import java.awt.BorderLayout;

import javax.swing.JLabel;

import org.apache.log4j.Logger;
import org.protege.editor.owl.ui.view.AbstractOWLViewComponent;

public class LizardViewComponent extends AbstractOWLViewComponent {

	private static final long serialVersionUID = 1L;
	
	private Logger logger = Logger.getLogger(LizardViewComponent.class);
	
	@Override
	protected void disposeOWLView() {
		
	}

	@Override
	protected void initialiseOWLView() throws Exception {
		logger.info("Initializing Lizard Plugin...");
		
		setLayout(new BorderLayout());
		add(new JLabel("Here Be Dragons! Lizard Things...", JLabel.CENTER), BorderLayout.CENTER);
		
//		JPanel editorPanel = new JPanel(new BorderLayout());
//		JPanel resultsPanel = new JPanel(new BorderLayout());
	
//		JSplitPane splitter = new JSplitPane(JSplitPane.VERTICAL_SPLIT, editorPanel, resultsPanel);
//		editorPanel.add(new JLabel("Testing"), BorderLayout.CENTER);
	
//		setLayout(new BorderLayout());
//		add(splitter, BorderLayout.CENTER);
	}

}
