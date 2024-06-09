package co.cue.edu.practicaSpring.demo.repositories.impl;

import co.cue.edu.practicaSpring.demo.model.User;
import co.cue.edu.practicaSpring.demo.repositories.UserRepository;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository //Indican a springboot que en esta clase estamos manejando un espacio de persistencia y necesitamos que nos habilite en memoria un contexto o que esté preparado porque vamos a manejar una conexión a base de datos
@Transactional
public class UserRepositoryImpl implements UserRepository {
    //@Autowired para inyectar una clase en sppring
    @PersistenceContext //para inyectar un recurso
    private EntityManager entityManager;

    @Override
    public List<User> listUsers() {
        String query = "FROM User"; //Esto es un string pero lo que escribimos por dentro es JPQL. Este significa que ya no estamos apuntando como tal a tablas (Consulta sql nativa). Trabajamos con tablas como la clase "User"
        return entityManager.createQuery(query).getResultList(); //crea una query y el resultado de esa query es una lista
    }

    @Override
    public void removeUser(Long id) /*/La persona nos envía el id del usuario a ser eliminado/*/{
        User user = entityManager.find(User.class, id); //Agarramos el entity manager y le decimos find, que encuentre la clase en la que estamos interesados y le mandamos el id que estamos buscando
        entityManager.remove(user); //Le decimos al entity manager que elimine ese usuario
    }

    @Override
    public void addUser(User user) /*/Para agregar un usuario debemos tener el usuario/*/ {
        entityManager.merge(user); //el merge sirve para unir, osea que le mandamos el usuario para que se haga la inserción a la base de datos
    }
}
