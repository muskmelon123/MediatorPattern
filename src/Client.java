
public class Client {

	public static void main(String args[]) {
		Button button = new Button();
		List list = new List();
		ComboBox comboBox = new ComboBox();
		ConcreteMediator concreteMediator = new ConcreteMediator();
		
		concreteMediator.button = button;
		concreteMediator.list = list;
		concreteMediator.comboBox = comboBox;
		
		button.setMediator(concreteMediator);
		list.setMediator(concreteMediator);
		comboBox.setMediator(concreteMediator);
		
		button.changed();
	}
}
