import java.lang.annotation.*;

@Repeatable(Meals.class)
@Retention(RetentionPolicy.RUNTIME)
@interface Meal {
    String value();
    String mainDish();
}

@Retention(RetentionPolicy.RUNTIME)
@interface Meals {
    Meal[] value();
}

public class DietPlanner {
    @Meal(value = "breakfast", mainDish = "cereal")
    @Meal(value = "lunch", mainDish = "pizza")
    @Meal(value = "dinner", mainDish = "salad")
    public void evaluateDiet() {
      
    }
}
