package ru.relex.delivery.services.model.order;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import org.immutables.value.Value;
import ru.relex.delivery.commons.model.StatusesOfOrder;
import ru.relex.delivery.db.handler.StatusTypeOfOrderHandler;

@Value.Immutable
@JsonDeserialize(builder = ImmutableUpdatableOrder.Builder.class)
public interface UpdatableOrder {

    StatusesOfOrder getStatus();


}
