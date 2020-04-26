package my.sunghyuk.lifemusic.test.service;

import static org.junit.Assert.assertEquals;
import static org.mockito.BDDMockito.given;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import my.sunghyuk.lifemusic.domain.CategorySearch;
import my.sunghyuk.lifemusic.domain.Menu;
import my.sunghyuk.lifemusic.entity.CategoryEntity;
import my.sunghyuk.lifemusic.entity.enums.CategoryType;
import my.sunghyuk.lifemusic.repository.CategoryRepository;
import my.sunghyuk.lifemusic.service.CommonService;
import my.sunghyuk.lifemusic.service.CommonServiceImpl;

@RunWith(value = MockitoJUnitRunner.class)
public class CommonServiceTests {

    private CommonService commonService;

    @Mock
    private CategoryRepository categoryRepository;

    @Test
    public void menuCallTests() {
        // given
        final CategoryEntity[] arrMenus = {
            new CategoryEntity(),
            new CategoryEntity(),
            new CategoryEntity()
        };
        List<CategoryEntity> arr = Arrays.asList(arrMenus);
        given(categoryRepository.findCategories(CategoryType.MENU, null)).willReturn(arr);
        commonService = new CommonServiceImpl(categoryRepository);

        // when
        final List<Menu> menus = commonService.getMenus();

        // then
        assertEquals(3, menus.size());
    }
}