package devminicontrolempleados.domain.service;

import devminicontrolempleados.persistance.entity.Empleado;
import devminicontrolempleados.persistance.repository.pagin.IEmpleadoRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service    @Transactional
@RequiredArgsConstructor
public class EmpleadoService {

    private final IEmpleadoRepository empleadoRepository;

    public Page<Empleado> findAll(int page, int size) {
        Pageable pageable = PageRequest.of(page, size);
        return empleadoRepository.findAll(pageable);
    }

    public Empleado findById(Long id) {
        if(!this.empleadoRepository.existsById(id)){
            return null;
        }

        return empleadoRepository.findById(id).get();
    }
    public void save(Empleado empleado) {
        empleadoRepository.save(empleado);
    }

    public void delete(Long id) {
        if(!this.empleadoRepository.existsById(id)){
            return;
        }
        empleadoRepository.deleteById(id);
    }

    public boolean existsById(Long id) {
        if (this.empleadoRepository.existsById(id)){
            return empleadoRepository.existsById(id);
        } else {
            return false;
        }
    }
}
