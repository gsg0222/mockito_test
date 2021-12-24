package blog.tsuchiya.mockito_test;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class ServiceSampleTest {

	@Test
	@DisplayName("saveLengthメソッドが正しくRepositoryに値を渡している")
	void saveLengthTest() {
		RepositorySample repositoryMock = mock(RepositorySample.class);
		when(repositoryMock.saveLength("test")).thenReturn(4);
		var service = new ServiceSample(repositoryMock);
		assertEquals(4, service.saveLength("test"));
		verify(repositoryMock, times(1)).saveLength("test");
	}

}
