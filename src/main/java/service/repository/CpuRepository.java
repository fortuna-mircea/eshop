package service.repository;

import org.springframework.data.repository.CrudRepository;
import service.models.Cpu;

public interface CpuRepository extends CrudRepository<Cpu,String> {

}
