package zn.taco_cloud;

import org.springframework.data.repository.PagingAndSortingRepository;


public interface TacoRepository extends PagingAndSortingRepository<Taco, Long> {

}