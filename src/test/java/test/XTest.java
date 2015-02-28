package test;

import com.sao.easymock.EasyMockServlet;
import org.easymock.EasyMock;
import org.junit.Test;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.sql.ResultSet;

/**
 * Created by navia on 2015/2/28.
 */
public class XTest {

    @Test
    public void testAAA(){
        HttpServletRequest mockHSR = EasyMock.createMock(HttpServletRequest.class);

        EasyMock.expect(mockHSR.getParameter("xxx")).andReturn("ffff");
        EasyMock.replay(mockHSR);

        EasyMockServlet ems = new EasyMockServlet();
        try {
            ems.doGet(mockHSR, null);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
