package com.singtel.zoo.model.walkinganimal;

import com.singtel.zoo.model.Walkinganimal;
import com.singtel.zoo.model.flyinganimal.Bird;

public class Caterpillar implements Walkinganimal {
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Caterpillar(String name) {
		super();
		this.name = name;
	}

	public Caterpillar() {
		super();
	}

	public class Butterfly extends Bird {
		private String name;

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public Butterfly(String name) {
			super();
			this.name = name;
		}

		public Butterfly() {
			super();
		}

	}

}
