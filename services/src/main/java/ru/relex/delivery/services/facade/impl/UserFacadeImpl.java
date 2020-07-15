package ru.relex.delivery.services.facade.impl;

import javax.validation.Valid;

import ru.relex.delivery.services.facade.UserFacade;
import ru.relex.delivery.services.meta.Facade;
import ru.relex.delivery.services.model.user.ExistingUser;
import ru.relex.delivery.services.model.user.NewUser;
import ru.relex.delivery.services.model.user.UpdatableUser;
import ru.relex.delivery.services.internal.UserService;

@Facade
public class UserFacadeImpl implements UserFacade {

  private final UserService userService;

  public UserFacadeImpl(final UserService userService) {
    this.userService = userService;
  }

  @Override
  public ExistingUser createUser(@Valid final NewUser user) {
    return userService.createUser(user);
  }

  @Override
  public ExistingUser getById(long id) {
    return userService.getById(id);
  }

  @Override
  public ExistingUser update(long id, UpdatableUser updatableUser) {
    return userService.update(id, updatableUser);
  }

  @Override
  public boolean deleteById(long id) {
    return userService.deleteById(id);
  }
}