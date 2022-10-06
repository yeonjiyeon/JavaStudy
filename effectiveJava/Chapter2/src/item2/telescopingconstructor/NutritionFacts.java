package item2.telescopingconstructor;

public class NutritionFacts {
	//점층적 생성자 패턴
	private final int servingSize;  // (mL)            required
	private final int servings;     // (per container) required
	private final int calories;     // (per serving)   optional
	private final int fat;          // (g/serving)     optional
	private final int sodium;       // (mg/serving)    optional
	private final int carbohydrate; // (g/serving)     optional

	public NutritionFacts(int servingSize, int servings) {
		this(servingSize, servings, 0);
	}

	public NutritionFacts(int servingSize, int servings, int calories) {
		this(servingSize, servings, calories, 0);
	}

	public NutritionFacts(int servingSize, int servings, int calories, int fat) {
		this(servingSize, servings, calories, fat, 0);
	}

	public NutritionFacts(int servingSize, int servings, int calories, int fat, int sodium) {
		this(servingSize, servings, calories, fat, sodium, 0);
	}

	public NutritionFacts(int servingSize, int servings, int calories, int fat, int sodium, int carbohydrate) {
		this.servingSize  = servingSize;
		this.servings     = servings;
		this.calories     = calories;
		this.fat          = fat;
		this.sodium       = sodium;
		this.carbohydrate = carbohydrate;
	}
	
	public void main(String[] argus) {
		//원하는 매개변수를 모두 포함한 생성자 중 가장 짧은 것을 골라 호출한다
		//-> 사용자가 설정하길 원치 않는 매개변수까지 포함할 수 있다!
		NutritionFacts cocaCola = new NutritionFacts(240, 8, 100, 0, 35, 27);
	}


}
