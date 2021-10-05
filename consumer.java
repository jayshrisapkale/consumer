

import java.util.function.Consumer;

public class consumerexample {

	public static void main(String[] args) {
Consumer<String> print = X -> System.out.println(X);
Consumer<Integer>p = X -> System.out.println(X);
print.accept("helloworld");
p.accept(67584);
	}

}
