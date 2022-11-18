package cat.itacademy.barcelonactiva.gimeno.carlos.s04.t02.n01.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import cat.itacademy.barcelonactiva.gimeno.carlos.s04.t02.n01.model.Fruita;

public interface FruitaRepository extends JpaRepository<Fruita,Long> {
	
	List<Fruita> findByPublished(boolean published);

	List<Fruita> findByTitleContaining(String nom);

}
