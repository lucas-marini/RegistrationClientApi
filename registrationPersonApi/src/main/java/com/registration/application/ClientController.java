package com.registration.application;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

// TODO: Auto-generated Javadoc
/**
 * The Class ClientController.
 */
@RestController
@RequestMapping("/clients")
public class ClientController {

	/** The client repository. */
	@Autowired
	private ClientRepository clientRepository;

	/**
	 * List.
	 *
	 * @return the list
	 */
	@GetMapping
	public List<Client> list() {
		return clientRepository.findAll();
	}

	/**
	 * Adds the.
	 *
	 * @param client the client
	 * @return the client
	 */
	@PostMapping
	@ResponseStatus(HttpStatus.CREATED)
	public Client add(@RequestBody Client client) {
		return clientRepository.save(client);
	}

	/**
	 * Delete.
	 *
	 * @param id the id
	 * @return the string
	 */
	@RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
	@ResponseBody
	public String delete(@PathVariable(name = "id", required = true) Long id) {
		System.out.println(id);
		clientRepository.deleteById(id);
		return "Successfully deleted !!";
	}
}
