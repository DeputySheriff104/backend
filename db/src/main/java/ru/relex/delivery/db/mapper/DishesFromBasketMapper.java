package ru.relex.delivery.db.mapper;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import ru.relex.delivery.db.model.DishesFromBasketModel;
import ru.relex.delivery.db.model.PositionInOrderModel;

import java.util.List;

public interface DishesFromBasketMapper {
    @Select("" +
            "SELECT user_id  as user_id ," +
            " dish_id  as dishId , " +
            " res_id   , " +
            "       count " +
            "FROM dishesFromBasket   " +
            "WHERE  user_id = #{user_id}"
    )
    List<DishesFromBasketModel> getDishesFromBasket(@Param("user_id") long user_id);

    void addDishToBasket(@Param("user_id") long userId, @Param("dish_id") long dishId, @Param("count") long count);

    void updateDishCount(@Param("user_id") long userId, @Param("dish_id") long dishId, @Param("count") long count);

    void deleteDishFromBasket(@Param("user_id") long user_id, @Param("dish_id") long dishId);

    void deleteDishFromBasketIndex(@Param("res_id") long res_id);

    @Select("" +
            "SELECT user_id  as user_id ," +
            " dish_id  as dishId , " +
            " res_id   , " +
            "       count " +
            "FROM dishesFromBasket   " +
            "WHERE  user_id = #{user_id} AND dish_id = #{dish_id}"
    )
    DishesFromBasketModel getDishFromUserIdDishId(@Param("user_id") long user_id, @Param("dish_id") long dishId);
}
