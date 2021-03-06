//package ru.relex.delivery.services.internal;
//
//import org.junit.jupiter.api.Assertions;
//import org.junit.jupiter.api.BeforeEach;
//import org.junit.jupiter.api.Test;
//import org.mockito.Mockito;
//import ru.relex.delivery.services.internal.impl.OrderServiceImpl;
//import ru.relex.delivery.services.mapper.OrderStruct;
//import ru.relex.delivery.services.model.order.*;
//
//import java.util.Arrays;
//
//class OrderServiceTest {
//    private static OrderService orderService;
//
//    private static final NewOrder newOrder = ImmutableNewOrder
//            .builder()
//            .listOfDishes(Arrays.asList(ImmutablePositionInOrder
//                    .builder()
//                    .count(1)
//                    .dishId(56)
//                    .build()))
//            .address(ImmutableAddress
//                    .builder()
//                    .city("voronezh")
//                    .street("lesnaya")
//                    .house("565")
//                    .flat("12")
//                    .entrance("5")
//                    .build())
//            .phone("8950383839")
//            .build();
//
//    private static final CreatedOrder createdOrder = ImmutableCreatedOrder
//            .builder()
//            .id(1)
//            .check(0)
//             .status(ImmutableOrderStatus.builder().build())
//            .from(newOrder)
//            .build();
//
//    @BeforeEach
//    void setup() {
//        OrderStruct mock = Mockito.mock(OrderStruct.class);
//
//        Mockito.when(mock.fromNewOrder(
//                Mockito.argThat(a -> !newOrder.equals(a)), Mockito.anyLong(), Mockito.anyDouble()))
//                .thenThrow(new RuntimeException());
//
//        Mockito.when(mock.fromNewOrder(newOrder, 1L, 0)).thenReturn(createdOrder);
//        Mockito.when(mock.merge(Mockito.any(), Mockito.any())).thenThrow(new RuntimeException());
//        Mockito.when(mock.defaultStatusMapper(Mockito.any())).thenThrow(new RuntimeException());
//
//        orderService = new OrderServiceImpl(mock);
//    }
//
//    @Test
//    void checkUserWillBeCreated() {
//        Assertions.assertEquals(orderService.createOrder(newOrder), createdOrder);
//    }
//
//    @Test
//    void checkUserCanBeGet() {
//        var createdOrder = orderService.createOrder(newOrder);
//        Assertions.assertEquals(orderService.getOrderById(1L), createdOrder);
//    }
//
//    @Test
//    void checkUsersNotExistsAtStart() {
//        Assertions.assertNull(orderService.getOrderById(1L));
//    }
//
//    @Test
//    void checkNothingToDeleteBeDeleted() {
//        Assertions.assertFalse(orderService.deleteOrderById(1L));
//    }
//
//    @Test
//    void checkWillBeDeleted() {
//        orderService.createOrder(newOrder);
//        Assertions.assertTrue(orderService.deleteOrderById(1L));
//    }
//
//    @Test
//    void testMock() {
//        Assertions.assertEquals(orderService.createOrder(newOrder), createdOrder);
//
//    }
//}