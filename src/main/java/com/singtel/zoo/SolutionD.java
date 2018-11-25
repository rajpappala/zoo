package com.singtel.zoo;

import com.singtel.zoo.model.walkinganimal.Caterpillar;
import com.singtel.zoo.model.walkinganimal.Caterpillar.Butterfly;

public class SolutionD {

	public static void main(String[] args) {
		annswerQuestion4();
	}

	public static void annswerQuestion4() {
		System.out.println("Question D,1(a),1(b) - 2(a),2(b)");
		Caterpillar caterpillar = new Caterpillar();
		Butterfly butterfly = caterpillar.new Butterfly();
		butterfly.fly();
		caterpillar.walk();

	}
}
