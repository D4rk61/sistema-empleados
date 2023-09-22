package devminicontrolempleados.util.paginacion;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.domain.Page;

import java.util.List;

@NoArgsConstructor
@Getter @Setter
public class PageRender<T> {

    private String url;
    private Page<T> page;
    private int totalPaginas;
    private int numElementosPorPagina;
    private int paginaActual;
    private List<PageItem> paginas;

    public PageRender(String url, Page<T> page, int totalPaginas,
                      int numElementosPorPagina, int paginaActual, List<PageItem> paginas) {
        this.url = url;
        this.page = page;
        this.totalPaginas = totalPaginas;
        this.numElementosPorPagina = numElementosPorPagina;
        this.paginaActual = paginaActual;
        this.paginas = paginas;
    }
}
