package springboot.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class TopicsService {

	private List<Topics> topics = new ArrayList<>(Arrays.asList(new Topics("1", "java", "java description"),
			new Topics("2", "j2E", "java Enterprise Edition"), new Topics("3", "javaScript", "javaScript description")));

	public List<Topics> getTopics() {
		return topics;
	}

	public Topics getTopic(String id) {
		// TODO Auto-generated method stub
		return topics.stream().filter(t->t.getId().equals(id)).findFirst().get();
	}

	public void saveTopic(Topics topic) {
		topics.add(topic);
	}

	public void deleteTopic(String id) {
		// TODO Auto-generated method stub
		topics.removeIf(t->t.getId().equals(id));
	}

	public void updateTopic(String id, Topics topic) {
		for(int i=0;i<topics.size();i++){
			Topics t = topics.get(i);
			if(t.getId().equals(id))
			{
				topics.set(i, topic);
				return;
			}
			
		}
	}
}
