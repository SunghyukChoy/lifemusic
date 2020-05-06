package my.sunghyuk.lifemusic.test.controller;

import static org.mockito.BDDMockito.*;
import static org.mockito.Mockito.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.MockitoJUnitRunner;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import my.sunghyuk.lifemusic.controller.RecordController;
import my.sunghyuk.lifemusic.domain.Record;
import my.sunghyuk.lifemusic.service.RecordService;

@RunWith(value = MockitoJUnitRunner.class)
@WebAppConfiguration
@ContextConfiguration(locations = {"classpath:springContext/servlet-context.xml"})
public class RecordControllerTests {

    @Mock
    private RecordService recordService;

    @InjectMocks
    private RecordController recordController;

    private MockMvc mockMvc;

    @Before
    public void setUp() {
        MockitoAnnotations.initMocks(this);
        mockMvc = MockMvcBuilders.standaloneSetup(recordController).build();
    }

    @Test
    public void get_album_page_test() throws Exception {
        // given
        List<Record> albums = new ArrayList<Record>();
        albums.add(Record.builder().build());
        given(recordService.getAllRecords()).willReturn(albums);

        // when
        mockMvc.perform(get("/record/album"))
            .andExpect(status().isOk())
            .andExpect(view().name("record/list"))
            .andExpect(model().attribute("records", albums));

        // then
        then(recordService).should(atLeastOnce()).getAllRecords();
    }

}
