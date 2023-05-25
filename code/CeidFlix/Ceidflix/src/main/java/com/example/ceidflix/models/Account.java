package com.example.ceidflix.models;

import java.util.List;

public class Account {
    private BillingEntry billingEntry;
    private Subscription subscription;
    private User user;

    public Account() {
        this.billingEntry = new BillingEntry();
        this.subscription = new Subscription();
        this.user = new User();
    }

    public Account(BillingEntry billingEntry, Subscription subscription, User user) {
        this.billingEntry = billingEntry;
        this.subscription = subscription;
        this.user = user;
    }

    public BillingEntry getBillingEntry() {
        return billingEntry;
    }

    public void setBillingEntry(BillingEntry billingEntry) {
        this.billingEntry = billingEntry;
    }

    public Subscription getSubscription() {
        return subscription;
    }

    public void setSubscription(Subscription subscription) {
        this.subscription = subscription;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}

class BillingEntry {
    private BillingEntryType billingEntryType;

    public BillingEntry() {
        this.billingEntryType = new BillingEntryType();
    }

    public BillingEntry(BillingEntryType billingEntryType) {
        this.billingEntryType = billingEntryType;
    }

    public BillingEntryType getBillingEntryType() {
        return billingEntryType;
    }

    public void setBillingEntryType(BillingEntryType billingEntryType) {
        this.billingEntryType = billingEntryType;
    }
}

class BillingEntryType {
    // Add properties and methods specific to BillingEntryType
}

class Subscription {
    private Plan plan;
    private BillingInfo billingInfo;

    public Subscription() {
        this.plan = new Plan();
        this.billingInfo = new BillingInfo();
    }

    public Subscription(Plan plan, BillingInfo billingInfo) {
        this.plan = plan;
        this.billingInfo = billingInfo;
    }

    public Plan getPlan() {
        return plan;
    }

    public void setPlan(Plan plan) {
        this.plan = plan;
    }

    public BillingInfo getBillingInfo() {
        return billingInfo;
    }

    public void setBillingInfo(BillingInfo billingInfo) {
        this.billingInfo = billingInfo;
    }
}

class Plan {
    // Add properties and methods specific to Plan
}

class BillingInfo {
    private BillingMethod billingMethod;

    public BillingInfo() {
        this.billingMethod = new BillingMethod();
    }

    public BillingInfo(BillingMethod billingMethod) {
        this.billingMethod = billingMethod;
    }

    public BillingMethod getBillingMethod() {
        return billingMethod;
    }

    public void setBillingMethod(BillingMethod billingMethod) {
        this.billingMethod = billingMethod;
    }
}

class BillingMethod {
    // Add properties and methods specific to BillingMethod
}

class User {
    private String name;
    private String username;
    private String email;
    private List<Statistics> statistics;
    private MessageInbox messageInbox;
    private List<Content> streamingList;
    private FriendList friendList;
    private Search search;
    private List<Recommendation> recommendations;

    public User() {
        this.name = "";
        this.username = "";
        this.email = "";
        this.statistics = new ArrayList<>();
        this.messageInbox = new MessageInbox();
        this.streamingList = new ArrayList<>();
        this.friendList = new FriendList();
        this.search = new Search();
        this.recommendations = new ArrayList<>();
    }

    public User(String name, String username, String email) {
        this.name = name;
        this.username = username;
        this.email = email;
        this.statistics = new ArrayList<>();
        this.messageInbox = new MessageInbox();
        this.streamingList = new ArrayList<>();
        this.friendList = new FriendList();
        this.search = new Search();
        this.recommendations = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public List<Statistics> getStatistics() {
        return statistics;
    }

    public void setStatistics(List<Statistics> statistics) {
        this.statistics = statistics;
    }

    public MessageInbox getMessageInbox() {
        return messageInbox;
    }

    public void setMessageInbox(MessageInbox messageInbox) {
        this.messageInbox = messageInbox;
    }

    public List<Content> getStreamingList() {
        return streamingList;
    }

    public void setStreamingList(List<Content> streamingList) {
        this.streamingList = streamingList;
    }

    public FriendList getFriendList() {
        return friendList;
    }

    public void setFriendList(FriendList friendList) {
        this.friendList = friendList;
    }

    public Search getSearch() {
        return search;
    }

    public void setSearch(Search search) {
        this.search = search;
    }

    public List<Recommendation> getRecommendations() {
        return recommendations;
    }

    public void setRecommendations(List<Recommendation> recommendations) {
        this.recommendations = recommendations;
    }
}

class Statistics {
    private Content content;

    public Statistics() {
        this.content = new Content();
    }

    public Statistics(Content content) {
        this.content = content;
    }

    public Content getContent() {
        return content;
    }

    public void setContent(Content content) {
        this.content = content;
    }
}

class MessageInbox {
    private List<Message> messages;

    public MessageInbox() {
        this.messages = new ArrayList<>();
    }

    public List<Message> getMessages() {
        return messages;
    }

    public void setMessages(List<Message> messages) {
        this.messages = messages;
    }
}

class Message {
    private User sender;
    private User recipient;
    private Conversation conversation;

    public Message() {
        this.sender = new User();
        this.recipient = new User();
        this.conversation = new Conversation();
    }

    public Message(User sender, User recipient, Conversation conversation) {
        this.sender = sender;
        this.recipient = recipient;
        this.conversation = conversation;
    }

    public User getSender() {
        return sender;
    }

    public void setSender(User sender) {
        this.sender = sender;
    }

    public User getRecipient() {
        return recipient;
    }

    public void setRecipient(User recipient) {
        this.recipient = recipient;
    }

    public Conversation getConversation() {
        return conversation;
    }

    public void setConversation(Conversation conversation) {
        this.conversation = conversation;
    }
}

class Conversation {
    private List<User> participants;

    public Conversation() {
        this.participants = new ArrayList<>();
    }

    public List<User> getParticipants() {
        return participants;
    }

    public void setParticipants(List<User> participants) {
        this.participants = participants;
    }
}

class Content {
    private Genre genre;
    private ContentType contentType;
    private Rating rating;

    public Content() {
        this.genre = new Genre();
        this.contentType = new ContentType();
        this.rating = new Rating();
    }

    public Content(Genre genre, ContentType contentType, Rating rating) {
        this.genre = genre;
        this.contentType = contentType;
        this.rating = rating;
    }

    public Genre getGenre() {
        return genre;
    }

    public void setGenre(Genre genre) {
        this.genre = genre;
    }

    public ContentType getContentType() {
        return contentType;
    }

    public void setContentType(ContentType contentType) {
        this.contentType = contentType;
    }

    public Rating getRating() {
        return rating;
    }

    public void setRating(Rating rating) {
        this.rating = rating;
    }
}

class Genre {
    private String genreName;

    public Genre() {
        this.genreName = "";
    }

    public Genre(String genreName) {
        this.genreName = genreName;
    }

    public String getGenreName() {
        return genreName;
    }

    public void setGenreName(String genreName) {
        this.genreName = genreName;
    }
}

class ContentType {
    private String contentTypeName;

    public ContentType() {
        this.contentTypeName = "";
    }

    public ContentType(String contentTypeName) {
        this.contentTypeName = contentTypeName;
    }

    public String getContentTypeName() {
        return contentTypeName;
    }

    public void setContentTypeName(String contentTypeName) {
        this.contentTypeName = contentTypeName;
    }
}

class Rating {
    private int ratingValue;

    public Rating() {
        this.ratingValue = 0;
    }

    public Rating(int ratingValue) {
        this.ratingValue = ratingValue;
    }

    public int getRatingValue() {
        return ratingValue;
    }

    public void setRatingValue(int ratingValue) {
        this.ratingValue = ratingValue;
    }
}

class StreamingList {
    private List<Content> contentList;

    public StreamingList() {
        this.contentList = new ArrayList<>();
    }

    public List<Content> getContentList() {
        return contentList;
    }

    public void setContentList(List<Content> contentList) {
        this.contentList = contentList;
    }
}

class FriendList {
    private List<User> friends;

    public FriendList() {
        this.friends = new ArrayList<>();
    }

    public List<User> getFriends() {
        return friends;
    }

    public void setFriends(List<User> friends) {
        this.friends = friends;
    }
}

class Search {
    private SearchResult searchResult;
    private List<String> filters;

    public Search() {
        this.searchResult = new SearchResult();
        this.filters = new ArrayList<>();
    }

    public SearchResult getSearchResult() {
        return searchResult;
    }

    public void setSearchResult(SearchResult searchResult) {
        this.searchResult = searchResult;
    }

    public List<String> getFilters() {
        return filters;
    }

    public void setFilters(List<String> filters) {
        this.filters = filters;
    }
}

class SearchResult {
    private List<Content> contentList;

    public SearchResult() {
        this.contentList = new ArrayList<>();
    }

    public List<Content> getContentList() {
        return contentList;
    }

    public void setContentList(List<Content> contentList) {
        this.contentList = contentList;
    }
}

class Recommendation {
    private RecommendationType recommendationType;

    public Recommendation() {
        this.recommendationType = new RecommendationType();
    }

    public Recommendation(RecommendationType recommendationType) {
        this.recommendationType = recommendationType;
    }

    public RecommendationType getRecommendationType() {
        return recommendationType;
    }

    public void setRecommendationType(RecommendationType recommendationType) {
        this.recommendationType = recommendationType;
    }
}

class RecommendationType {
    // Add properties and methods specific to RecommendationType
}
