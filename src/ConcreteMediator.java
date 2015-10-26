
public class ConcreteMediator extends Mediator {

	public List list;
	public Button button;
	public ComboBox comboBox;
	
	@Override
	public void componentChanged(Component component) {
		// TODO Auto-generated method stub
		if(component == button) {
			list.update();
			comboBox.update();
		}
	}

}
