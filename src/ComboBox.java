
public class ComboBox extends Component {

	@Override
	public void update() {
		// TODO Auto-generated method stub
		System.out.print("zuhekuang zengjiayixiang:zhangwuji");
	}
	
	public void select() {
		System.out.print("zuhekuang xuanzhongxiang:xiaolongnv。");
	}

}
//注意，相当于Mediator和Component相互引用，点击Button，调用Button.changed,然后里面调用Mediator.componentChanged(Component component),这个里面
//的component参数就是原来的Button，然后在componentChanged这个函数里写点击Button后的业务函数。