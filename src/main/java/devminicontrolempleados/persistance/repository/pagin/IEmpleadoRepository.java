package devminicontrolempleados.persistance.repository.pagin;

import devminicontrolempleados.persistance.entity.Empleado;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IEmpleadoRepository extends PagingAndSortingRepository<Empleado, Long> {

    Page<Empleado> findAll(Pageable pageable);
}
