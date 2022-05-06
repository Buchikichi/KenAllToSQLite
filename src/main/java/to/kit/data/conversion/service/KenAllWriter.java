package to.kit.data.conversion.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import to.kit.data.conversion.entity.KenAll;
import to.kit.data.conversion.repository.KenAllRepository;

import javax.transaction.Transactional;

@Service
public class KenAllWriter {
	@Autowired
	private KenAllRepository kenAllRepository;

	@Transactional
	public void save(List<KenAll> list) {
		for (var rec : list) {
			this.kenAllRepository.save(rec);
		}
	}

	public long deleteAll() {
		var count = this.kenAllRepository.count();

		this.kenAllRepository.deleteAll();
		return count;
	}
}
