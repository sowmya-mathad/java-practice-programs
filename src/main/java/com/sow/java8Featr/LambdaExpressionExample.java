package com.sow.java8Featr;

@FunctionalInterface
interface Drawable {
	public abstract void draw();
}

public class LambdaExpressionExample {
	int width = 10;

	public static void main(String args[]) {
		// Drawable objDrawable = new Drawable() {
		//
		// @Override
		// public void draw() {
		// System.out.println("This is the draw method.");
		//
		// }
		// };
		/* with lamda expression */
		Drawable objDrawable = () -> {
			System.out.println("This is the draw method.");
		};
		objDrawable.draw();

	}
}
