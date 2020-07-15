package ru.relex.delivery.services.facade;

import javax.validation.Valid;
import ru.relex.delivery.services.model.dish.NewDish;
import ru.relex.delivery.services.model.dish.CreatedDish;
import ru.relex.delivery.services.model.dish.UpdatableDish;

public interface DishFacade {

  CreatedDish createDish(@Valid NewDish dish);

  CreatedDish getById(long id);

  CreatedDish update(long id, UpdatableDish updatableDish);

  boolean deleteById(long id);
}