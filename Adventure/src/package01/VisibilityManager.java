package package01;

public class VisibilityManager {
	
	UI ui;
	
	public VisibilityManager(UI userInterface) {
		
		ui = userInterface;
	}
	
	public void showTitleScreen() {
		
		//Show the title screen
		ui.titleNamePanel.setVisible(true);
		ui.startButtonPanel.setVisible(true);
		ui.mainTextPanel.setVisible(false);
		ui.playerPanel.setVisible(false);
		ui.choiceButtonPanel.setVisible(false);
	}
	
	public void titleToTown() {
		
		//Show the game screen
		ui.titleNamePanel.setVisible(false);
		ui.startButtonPanel.setVisible(false);
		ui.mainTextPanel.setVisible(true);
		ui.playerPanel.setVisible(true);
		ui.choiceButtonPanel.setVisible(true);
	}
}
