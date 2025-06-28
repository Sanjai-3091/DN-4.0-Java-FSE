package com.example;
import static org.mockito.Mockito.*;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class MyServiceTest {
    @Test
    public void testVerifyInteraction() {
        // Step 1: Create a mock object
        ExternalApi mockApi = Mockito.mock(ExternalApi.class);

        // Step 2: Call method via service
        MyService service = new MyService(mockApi);
        service.fetchData();

        // Step 3: Verify that getData() was called on the mock
        verify(mockApi).getData();
    }
}
