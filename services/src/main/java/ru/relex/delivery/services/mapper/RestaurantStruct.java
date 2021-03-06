package ru.relex.delivery.services.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import ru.relex.delivery.db.model.RestaurantModel;
import ru.relex.delivery.services.model.restaurant.CreatedRestaurant;
import ru.relex.delivery.services.model.restaurant.NewRestaurant;
import ru.relex.delivery.services.model.restaurant.UpdatableRestaurant;
import ru.relex.delivery.commons.model.RestaurantType;

@Mapper
public interface RestaurantStruct {

  @Mapping(target = "restaurantName", source = "restaurant.restaurantName")
  @Mapping(target = "street", source = "restaurant.address.street")
  @Mapping(target = "building", source = "restaurant.address.building")
  @Mapping(target = "startWorkDay", source = "restaurant.workingHours.startWorkDay", dateFormat = "HH:mm")
  @Mapping(target = "endWorkDay", source = "restaurant.workingHours.endWorkDay", dateFormat = "HH:mm")
  RestaurantModel fromNewRestaurant(NewRestaurant restaurant);

  @Mapping(target = "id", source = "id")
  @Mapping(target = "restaurantName", source = "updatableRestaurant.restaurantName")
  @Mapping(target = "street", source = "updatableRestaurant.address.street")
  @Mapping(target = "building", source = "updatableRestaurant.address.building")
  @Mapping(target = "startWorkDay", source = "updatableRestaurant.workingHours.startWorkDay", dateFormat = "HH:mm")
  @Mapping(target = "endWorkDay", source = "updatableRestaurant.workingHours.endWorkDay", dateFormat = "HH:mm")
  RestaurantModel fromUpdatableRestaurant(UpdatableRestaurant updatableRestaurant, long id);

  @Mapping(target = "restaurantName", source = "model.restaurantName")
  @Mapping(target = "address.street", source = "model.street")
  @Mapping(target = "address.building", source = "model.building")
  @Mapping(target = "workingHours.startWorkDay", source = "model.startWorkDay", dateFormat = "HH:mm")
  @Mapping(target = "workingHours.endWorkDay", source = "model.endWorkDay", dateFormat = "HH:mm")
  @Mapping(target = "restaurantType", source = "restaurantType")
  @Mapping(target = "id", source = "id")
  CreatedRestaurant toCreatedRestaurant(RestaurantModel model, RestaurantType restaurantType, long id);

  @Mapping(target = "restaurantName", source = "model.restaurantName")
  @Mapping(target = "address.street", source = "model.street")
  @Mapping(target = "address.building", source = "model.building")
  @Mapping(target = "workingHours.startWorkDay", source = "model.startWorkDay", dateFormat = "HH:mm")
  @Mapping(target = "workingHours.endWorkDay", source = "model.endWorkDay", dateFormat = "HH:mm")
  @Mapping(target = "restaurantType", source = "restaurantType")
  CreatedRestaurant toCreatedRestaurant(RestaurantModel model);

  CreatedRestaurant[] toCreatedRestaurants(RestaurantModel[] all);

  @Mapping(target = "restaurantName", source = "updatableRestaurant.restaurantName")
  @Mapping(target = "restaurantType", source = "updatableRestaurant.restaurantType")
  @Mapping(target = "address", source = "updatableRestaurant.address")
  @Mapping(target = "workingHours", source = "updatableRestaurant.workingHours", dateFormat = "HH:mm")
  @Mapping(target = "restaurantImage", source = "updatableRestaurant.restaurantImage", dateFormat = "HH:mm")
  CreatedRestaurant merge(CreatedRestaurant restaurant, UpdatableRestaurant updatableRestaurant);
}
