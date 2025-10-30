    package com.miniproject.socialmediaplatform.controller;

    import org.springframework.web.bind.annotation.RestController;
    import org.springframework.web.bind.annotation.RequestMapping;
    import org.springframework.web.bind.annotation.GetMapping;
    import org.springframework.web.bind.annotation.PostMapping;
    import org.springframework.web.bind.annotation.RequestBody;
    import org.springframework.beans.factory.annotation.Autowired;

    import com.miniproject.socialmediaplatform.model.Comment;
    import com.miniproject.socialmediaplatform.repository.CommentRepository;

    import java.util.List;

    @RestController
    @RequestMapping()
    public class CommentController{

        @Autowired
        CommentRepository repo;

        @GetMapping("/comment")
        public List<Comment> getAllComments() {
            return repo.findAll();
        }

        @PostMapping("/comment")
        public Comment addComment(@RequestBody Comment comment) {
        return repo.save(comment);
        }
    }