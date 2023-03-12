/**
 * @author Lia Kruger - alkruger2
 * CIS175 - Spring 2023
 * Mar 11, 2023
 */
package dmacc.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import dmacc.beans.Location;

@Repository
public interface LocationRepository extends
JpaRepository<Location, Long> {}
