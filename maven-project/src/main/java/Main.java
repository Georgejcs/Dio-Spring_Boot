import java.time.LocalDate;

import org.mapstruct.factory.Mappers;

import dto.UserDTO;
import mapper.UserMapper;
import model.UserModel;

public class Main {
	
	private final static UserMapper mapper = Mappers.getMapper(UserMapper.class);
	
	public static void main(String[] args) {
		var model = new UserModel();
		model.setCode(1);
		model.setUserName("James");
		model.setBirthday(LocalDate.now().minusYears(30));
		System.out.println(mapper.toDTO(model));
		
		var dto = new UserDTO();
		dto.setId(2);
		dto.setName("Maria");
		dto.setBirthdate(LocalDate.now().minusYears(30));
		System.out.println(mapper.toModel(dto));
	}
}
